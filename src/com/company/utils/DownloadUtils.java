package com.company.utils;

import java.io.File;
import java.util.Map;

public class DownloadUtils {
  public static void getFileList(File file, Map<String,String> filemap){
    File[] files = file.listFiles();
    for (File f: files) {
      if(f.isDirectory()){
        getFileList(f,filemap);
      }else {
        String filename = f.getName();
        int index = filename.indexOf("_");
        String realName = filename.substring(index+1);
        filemap.put(filename,realName);
      }
    }

  }
}
