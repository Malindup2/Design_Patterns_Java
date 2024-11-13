package Stratergy;

public class Compressor {
	CompressionStratergy compressiontratergy;
	void setCompressor(CompressionStratergy compressiontratergy) {
		this.compressiontratergy=compressiontratergy;
	}
	
	void compressFile(String filename) {
		compressiontratergy.compress(filename);
	}
}
