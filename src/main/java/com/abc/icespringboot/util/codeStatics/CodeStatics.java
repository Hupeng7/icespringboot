package com.abc.icespringboot.util.codeStatics;

import java.io.*;

public class CodeStatics {
    public static int sumFile = 0;
    public static int sumLine = 0;

    public CodeStatics() {
    }

    public static void codeStatics(File inFile, BufferedWriter bufferedWriter) throws IOException {
        for (File file :
                inFile.listFiles()) {
            if (file.isFile() && file.getName().endsWith(".js")) {
                int line = 0;
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), "utf-8"));
                String s = null;
                while ((s = bufferedReader.readLine()) != null) {
                    s = s.replaceAll("\\s", "");
                    if ("".equals(s)
                            || s.startsWith("//")
                            || s.startsWith("/*")
                            || s.startsWith("/**")
                            || s.startsWith("*")) {
                        //过滤掉注释
                    } else {
                        line++;
                        System.out.println(line + ":" + s);
                    }
                }
                bufferedReader.close();
                System.out.println(file.getName() + "\t\t" + line);

                bufferedWriter.newLine();
                bufferedWriter.write(file.getName() + "\t\t" + line);
                bufferedWriter.newLine();
                bufferedWriter.flush();

                sumFile++;
                sumLine += line;
                System.out.println("统计：" + sumFile + "个类\t" + sumLine + "行");
            } else if (file.isDirectory()) {
                codeStatics(file, bufferedWriter);
            }
        }
    }

    public static void main(String[] args) {
        try {
            File inFile = new File("D://git//icecreamOSSApi//app");
            FileOutputStream fileOutputStream = new FileOutputStream("D://result.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, "utf-8"));
            bufferedWriter.write("类名\t\t行数");


            codeStatics(inFile, bufferedWriter);
            bufferedWriter.newLine();
            bufferedWriter.write("一共:" + sumFile + "个类\t\t" + sumLine + "行代码");

            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}




