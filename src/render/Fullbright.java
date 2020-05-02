package render;

import org.lwjgl.input.Keyboard;

import event.EventTarget;
import events.EventUpdate;
import module.Category;
import module.Module;

public class Fullbright extends Module {
	private float oldBrightness() {
		return 0;
	}
	
	public Fullbright() {
		super(name = "Fullbright", Keyboard.KEY_P, Category.RENDER);
	}
	
	public void onEnable() {
		super.onEnable();
		
		float oldBrightness = mc.gameSettings.gammaSetting;
	}
	
	@EventTarget
	public void onUpdate(EventUpdate event) {
		mc.gameSettings.gammaSetting = 10F;
	}
	
	@Override
	public void onDisable() {
		super.onDisable();
		
		mc.gameSettings.gammaSetting = oldBrightness();
	}
}
