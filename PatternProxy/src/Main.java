public class Main {
	public static void main(String[] args) {
		IRenderer renderer = new RendererProxy();
		renderer.renderCircle();
		renderer.renderSquare();

		renderer = new Renderer();
		renderer.renderCircle();
		renderer.renderSquare();
	}
}