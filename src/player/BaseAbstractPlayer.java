package player;

import gameobject.BaseAbstractNamedObject;

abstract class BaseAbstractPlayer extends BaseAbstractNamedObject implements Player {
	
	public BaseAbstractPlayer(String name) {
		super(name);
	}
	
}
