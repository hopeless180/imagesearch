package MyPack;

import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;

public class ImageEdge {
	//边缘提取，考虑废弃而采用opencv方法
	public final BufferedImage getImgEdge(BufferedImage originalImg) {  
        int imageWidth = originalImg.getWidth();  
        int imageHeight = originalImg.getHeight();  
  
        BufferedImage newImg = new BufferedImage(imageWidth, imageHeight,  
                BufferedImage.TYPE_3BYTE_BGR);  
  
        float[] elements = { 0.0f, -1.0f, 0.0f, -1.0f, 4.0f, -1.0f, 0.0f,  
                -1.0f, 0.0f };  
  
        // AffineTransform at = new AffineTransform();  
        Kernel kernel = new Kernel(3, 3, elements);  
        ConvolveOp cop = new ConvolveOp(kernel, ConvolveOp.EDGE_NO_OP, null);  
        cop.filter(originalImg, newImg);  
        return newImg;  
    }  
}
