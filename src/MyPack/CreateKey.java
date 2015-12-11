package MyPack;

import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class CreateKey {
	//写入索引文件
	public static void writeIndex(String filename, String str) throws IOException{
		File file = new File("./settings/index");
		FileWriter fw = new FileWriter(file.getName(), true);
		BufferedWriter bw = new BufferedWriter(fw);
		fw.write("[ "+filename+" ]");
		bw.close();
	};
	//读取索引文件，暂时没用
	public static File loadIndex(){
		File file = new File("./settings/index");
		return file;
	};
	public static void getName(){
		
	};
	public static void getKey(){
		
	};
}
