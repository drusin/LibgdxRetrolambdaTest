package dawid.libgdxretrolambdatest;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;

public class LibgdxRetrolambdaTest extends ApplicationAdapter {

	public static final Consumer CONSUMER = s -> Gdx.app.log("message", s);

	@Override
	public void render () {
		CONSUMER.accept("hello");
	}

	private interface Consumer {
		void accept(String str);
	}
}
