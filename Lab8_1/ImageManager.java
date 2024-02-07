public class ImageManager {
    private Renderer renderer;
    public void setRenderer(Renderer renderer) {
		this.renderer = renderer;
	}
	public void showImage() {
		
		//ขัดหลัก open/closed principle
		/*if(renderer instanceof TVRenderer) {
			TVRenderer tvRenderer = (TVRenderer) renderer;
			tvRenderer.showImage();
		} else if(renderer instanceof LaptopRenderer) {
			LaptopRenderer tvRenderer = (LaptopRenderer) renderer;
			tvRenderer.showImage();
		} else if(renderer instanceof SmartphoneRenderer) {
			SmartphoneRenderer tvRenderer = (SmartphoneRenderer) renderer;
			tvRenderer.showImage();
		}*/
		
		this.renderer.showImage();
	
	}
}

