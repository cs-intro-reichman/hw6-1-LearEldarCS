import java.awt.Color;

public class Editor4 {
    public static void main (String[] args) {
		String source = args[0]; //The PPM
        int n = Integer.parseInt(args[1]); //The Steps

        Color[][] sourceImage = Runigram.read(source);
        Color[][] grayscaledImage = Runigram.grayScaled(sourceImage);
        
        Runigram.setCanvas(sourceImage);
        Runigram.morph(sourceImage,grayscaledImage,n);
	}
}
