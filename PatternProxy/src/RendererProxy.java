public class RendererProxy implements IRenderer {
	private final Renderer renderer;

	public RendererProxy() {
		renderer = new Renderer();
	}


	@Override
	public void renderCircle() {
		System.out.println("proxy renderCircle");
		renderer.renderCircle();
	}

	@Override
	public void renderSquare() {
		System.out.println("proxy renderSquare");
		renderer.renderSquare();
	}
}
