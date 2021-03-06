package me.EdwJes.main;

import org.newdawn.slick.*;


public class Main {
	
	static AppGameContainer container;
	
	public final static String TITLE = "GAME GAIN";
	public final static int WINDOW_WIDTH = 1024,WINDOW_HEIGHT = 756;
	public final static int TILE_SIZE = 16;
	
	public static ListHandler listHandler;
	
	static double gravityModifier = 1;
	
	static public Input input;
	public static View view;

	public static void main(String[] args) {
		try{
		container=createAppGameContainer();
		container.start();}
		catch(SlickException e){ 
			e.printStackTrace();
			}
	}
	public static AppGameContainer createAppGameContainer() throws SlickException{
		listHandler = ListHandler.get();
		AppGameContainer app;
		app=new AppGameContainer(new DestructiveGame(), 1024, 756, false);
		app.setUpdateOnlyWhenVisible(false);
		app.setTitle(TITLE);
		app.setShowFPS(false);
		app.setTargetFrameRate(60);
		return app;
	}
	
	public static double increaseTowardsZero(double old, double speed){
		if((Math.abs(old) - speed) <= 0){
			return 0;
		}
		else return old - speed*Math.signum(old);
	}
	
	public static GameContainer getContainer(){
		return container;
	}
	
	public static double getGravityModifier(){
		return gravityModifier;
	}
	
	public static void setGravityModifier(double grav){
		gravityModifier = grav;
	}
	


}
