package Stratergy;

public class ZipCompression implements CompressionStratergy {

	@Override
	public void compress(String filename) {
		System.out.println(filename+"compression by Zip");
	}

}
