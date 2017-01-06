package pl.groobaz.screen;

import com.badlogic.gdx.graphics.Texture;

import pl.groobaz.game.JavaDevMattClikerGame;

public class SplashScreen extends AbstractScreen{

	private Texture splashImg;
	
	public SplashScreen(JavaDevMattClikerGame game) {
		super(game);
		init();
	}

	private void init() {
		//TODO implement better assets loading when game grows
		splashImg = new Texture("badlogic.jpg");
	}

	@Override
	public void render(float delta) {
		super.render(delta);
		
		spriteBatch.begin();
		spriteBatch.draw(splashImg,0,0);
		spriteBatch.end();
	}
	
}
