package Agent;

import java.awt.Point;
import java.util.Vector;

/**
 * Created by KevinWang on 10/16/16.
 * @ Zach Janice
 */

public abstract class Agent {
	private int level;
	private int team;
	
	private int health;
	private int maxHealth;
	private int damage;
	private int projectileSpeed;
	
	private Point position;
	private Vector velocity;
	
	private int baseMovementSpeed;
	private double movementSpeedFactor;
	private Vector acceleration;
	private Vector firingVector;
	
	public Agent(int level, int team) {
		this.level = level;
		this.team = team;
	}
	
	public final int getLevel() {
		return level;
	}
	
	public final int getTeam() {
		return team;
	}
	
	public final int getHealth() {
		return health;
	}
	
	public final int getDamage() {
		return damage;
	}
	
	public final Point getPosition() {
		return new Point(position);
	}
	
	public final int getBaseMovementSpeed() {
		return baseMovementSpeed;
	}
	
	public final double getMovementSpeedFactor() {
		return movementSpeedFactor;
	}
	
	public final Vector getVelocity() {
		return new Vector(velocity);
	}
	
	public final void update() {
		// TODO
	}
	
	public final int adjustHealth(int amount) {
		// TODO
	}
	
	public final void setBaseMovementSpeed(int amount) {
		// TODO
	}
	
	public final void setMovementSpeedFactor(double factor) {
		// TODO
	}
	
	public final void despawn() {
		// TODO
	}
	
	protected final void setMovementVector(Vector vector) {
		// TODO
	}
	
	protected final void setFiringVector(Vector vector) {
		// TODO
	}
	
	protected abstract void preUpdateCall();
	
	private final void move() {
		// TODO
	}
	
	private final void fireProjectile() {
		// 	TODO
	}
}
