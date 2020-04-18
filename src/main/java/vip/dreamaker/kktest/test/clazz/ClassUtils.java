package vip.dreamaker.kktest.test.clazz;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.JarURLConnection;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import org.apache.commons.lang3.StringUtils;

/**
 * @author changkaituo
 * @date 2020/4/17 14:40
 */
public class ClassUtils {

  public static void main(String[] args) throws IOException {
    Set<Class<?>> classes = getClasses("vip.dreamaker.kktest.test");
    classes.forEach(System.out::println);
  }

  public static Set<Class<?>> getClasses(String pkgName) throws IOException {
    Set<Class<?>> classSet = new HashSet<>();
    Enumeration<URL> urls = Thread.currentThread().getContextClassLoader()
        .getResources(pkgName.replace(".", "/"));
    while (urls.hasMoreElements()) {
      URL url = urls.nextElement();
      if (url != null) {
        String protocol = url.getProtocol();
        if ("file".equals(protocol)) {
          String pkgPath = url.getPath().replaceAll("%20", "");
          addClass(classSet, pkgPath, pkgName);
        } else if ("jar".equals(protocol)) {
          JarURLConnection jarURLConnection = (JarURLConnection) url.openConnection();
          if (jarURLConnection != null) {
            JarFile jarFile = jarURLConnection.getJarFile();
            if (jarFile != null) {
              Enumeration<JarEntry> jarEntries = jarFile.entries();
              while (jarEntries.hasMoreElements()) {
                JarEntry jarEntry = jarEntries.nextElement();
                String jarEntryName = jarEntry.getName();
                if (jarEntryName.endsWith(".class")) {
                  String className = jarEntryName.substring(0, jarEntryName.lastIndexOf("."))
                      .replaceAll("/", ".");
                  doAddClass(classSet, className);
                }
              }
            }
          }
        }
      }
    }
    return classSet;
  }

  private static void addClass(Set<Class<?>> classSet, String pkgPath, String pkgName) {
    File[] files = new File(pkgPath).listFiles(new FileFilter() {
      @Override
      public boolean accept(File file) {
        return (file.isFile() && file.getName().endsWith(".class")) || file.isDirectory();
      }
    });
    for (File file : files) {
      String fileName = file.getName();
      if (file.isFile()) {
        String className = fileName.substring(0, fileName.lastIndexOf("."));
        if (StringUtils.isNotEmpty(pkgName)) {
          className = pkgName + "." + className;
        }
        doAddClass(classSet, className);
      } else {
        String subPkgPath = fileName;
        if (StringUtils.isNotEmpty(pkgPath)) {
          subPkgPath = pkgPath + "/" + subPkgPath;
        }
        String subPkgName = fileName;
        if (StringUtils.isNotEmpty(pkgName)) {
          subPkgName = pkgName + "." + subPkgName;
        }
        addClass(classSet, subPkgPath, subPkgName);
      }
    }
  }

  private static void doAddClass(Set<Class<?>> classSet, String className) {
    Class<?> cls = loadClass(className, false);
    classSet.add(cls);
  }

  private static Class<?> loadClass(String className, boolean isInitialized) {
    Class<?> cls = null;
    try {
      cls = Class.forName(className,isInitialized,getClassLoader());
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
    return cls;
  }

  private static ClassLoader getClassLoader() {
    return Thread.currentThread().getContextClassLoader();
  }
}
