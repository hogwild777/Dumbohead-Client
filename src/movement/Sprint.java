package movement;

import org.lwjgl.input.Keyboard;
import event.EventTarget;
import events.EventUpdate;
import module.Category;
import module.Module;

public class Sprint extends Module {
	public Sprint() {
		super(name =  "Sprint", Keyboard.KEY_M, Category.MOVEMENT);
	}
	
	@EventTarget
	public void onUpdate(EventUpdate event) {
		if(!mc.player.isCollidedHorizontally && mc.player.moveForward > 0)
			mc.player.setSprinting(true);
			
	}
	
	@Override
	public void onDisable() {
		super.onDisable();
		
		mc.player.setSprinting(false);
	}
}
