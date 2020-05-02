package movement;

import org.lwjgl.input.Keyboard;

import event.EventTarget;
import events.EventUpdate;
import module.Category;
import module.Module;

public class Step extends Module {
	public Step() {
		super(name = "Step", Keyboard.KEY_V, Category.MOVEMENT);
	}
	
	@EventTarget
	public void onUpdate(EventUpdate event) {
		mc.player.stepHeight = 1.5F;
	}
	
	@Override
	public void onDisable() {
		super.onDisable();
		
		mc.player.stepHeight = .5F;
	}
}
