package application;

abstract public class ImageCollector {
	 //all of the image file paths
	 protected String ppath[] = new String[30];
	 //index number for the array
	 protected int index = 0;
	 
	 
	  public ImageCollector(int index) {
		 this.index = index;
		 popArray();
	 }
	  private void popArray() {
		  ppath[0] = "BostonSkyline.jpg";
		  ppath[1] = "CLOUDY.png";
		  ppath[2] = "DUSK.jpg";
		  ppath[3] = "NIGHT.png";
		  ppath[4] = "RAIN-SNOW.png";
		  ppath[5] = "SUNNY.png";
		  ppath[6] = "simple_weather_icons_cloudy.png";
		  ppath[7] = "Drizzle.png";
		  ppath[8] = "Fog-Icon.png";
		  ppath[9] = "Inclament-Weather.png";
		  ppath[10] = "Party-Cloudy-Icon.png";
		  ppath[11] = "Rain-Icon.png";
		  ppath[12] = "Sleet-or-snow-mix.png";
		  ppath[13] = "Snow-Icon.png";
		  ppath[14] = "Sunny-Icon.png";
		  ppath[15] = "Thunder-and-Lightning.png";
		  ppath[16] = "Wind-Icon.png";
		  ppath[17]	= "thunderbg.jpg";
		  ppath[18]	= "inclement-weather-52093.png";
	  }
	  public String getImage(int index) {
		  return ppath[index];
	  }
	  public void setIndex(int index) {
		  this.index = index;
	  }
	  public int getIndex() {
		  return index;
	  }
	  abstract public boolean Range();
}