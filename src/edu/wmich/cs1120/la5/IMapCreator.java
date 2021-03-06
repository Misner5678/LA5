package edu.wmich.cs1120.la5;
import java.io.IOException;

public interface IMapCreator {
	// Read from the file, set up the IArea[10][10] and set the terrain for the object of TerrainScanner 
	void scanTerrain(String fileName, int threshold) throws IOException;
	TerrainScanner getScanner(); 
	void setScanner(TerrainScanner scanner);
}
