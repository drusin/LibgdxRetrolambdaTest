package dawid.libgdxretrolambdatest.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import dawid.libgdxretrolambdatest.LibgdxRetrolambdaTest;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new LibgdxRetrolambdaTest(), config);
	}
}
