package module;

import java.util.ArrayList;

import movement.*;
import player.*;
import render.*;

public class ModuleManager {
	private ArrayList<Module> modules = new ArrayList<Module>();
	
	public ModuleManager() {
		// COMBAT
		
		// MOVEMENT
		modules.add(new Sprint());
		modules.add(new Fly());
		modules.add(new Step());
		
		// RENDER
		modules.add(new Fullbright());
		
		// PLAYER
		modules.add(new NoFall());
		
		// MISC
		
		// NONE
	}
	
	public ArrayList<Module> getModules() {
		return modules;
		
	}
	public Module getModuleByName(String name) {
		return modules.stream().filter(module -> module.getName().equalsIgnoreCase(name)).findFirst().orElse(null);
	}
	
}
