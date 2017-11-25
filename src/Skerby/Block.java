package Skerby;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;

public class Block {
	
	private Image blockDown = new ImageIcon("Images/StateLV1/FloorDown.png").getImage();
	private Image blockDownLeft = new ImageIcon("Images/StateLV1/FloorDownLeft.png").getImage();
	private Image blockDownRight = new ImageIcon("Images/StateLV1/FloorDownRight.png").getImage();
	private Image blockInside = new ImageIcon("Images/StateLV1/FloorInside.png").getImage();
	private Image blockLeft = new ImageIcon("Images/StateLV1/FloorLeft.png").getImage();
	private Image blockRight = new ImageIcon("Images/StateLV1/FloorRight.png").getImage();
	private Image blockTopLeft = new ImageIcon("Images/StateLV1/FloorTopLeft.png").getImage();
	private Image blockTopRight = new ImageIcon("Images/StateLV1/FloorTopRight.png").getImage();
	private Image blockTop = new ImageIcon("Images/StateLV1/FloorUp.png").getImage();
    
    private int x;
    private int y;
    
    public Block(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void render(Graphics2D g2d,int i){
    	if(i < 55){
    		g2d.drawImage(blockTop, x, y, null);
    	}else if(i < 205) {
    		g2d.drawImage(blockDown, x, y, null);
    	} else if(i < 215) {
    		g2d.drawImage(blockRight, x, y, null);
    	} else if(i < 226) {
    		g2d.drawImage(blockTop, x, y, null);
    	} else if(i < 227) {
    		g2d.drawImage(blockTopLeft, x, y, null);
    	}else if(i < 230) {
    		g2d.drawImage(blockLeft, x, y, null);
    	}else if(i < 231) {
    		g2d.drawImage(blockDownLeft, x, y, null);
    	}else if(i < 232) {
    		g2d.drawImage(blockTopRight, x, y, null);
    	}else if(i < 235) {
    		g2d.drawImage(blockRight, x, y, null);
    	}else if(i < 236) {
    		g2d.drawImage(blockDownRight, x, y, null);
    	}else if(i < 237) {
    		g2d.drawImage(blockTopLeft, x, y, null);
    	}else if(i < 238) {
    		g2d.drawImage(blockDownLeft, x, y, null);
    	}else if(i < 239) {
    		g2d.drawImage(blockTop, x, y, null);
    	}else if(i < 240) {
    		g2d.drawImage(blockDown, x, y, null);
    	}else if(i < 241) {
    		g2d.drawImage(blockTop, x, y, null);
    	}else if(i < 242) {
    		g2d.drawImage(blockDown, x, y, null);
    	}else if(i < 243) {
    		g2d.drawImage(blockTopRight, x, y, null);
    	}else if(i < 244) {
    		g2d.drawImage(blockDownRight, x, y, null);
    	}else if(i < 245) {
    		g2d.drawImage(blockTopLeft, x, y, null);
    	}else if(i < 249) {
    		g2d.drawImage(blockLeft, x, y, null);
    	}else if(i < 250) {
    		g2d.drawImage(blockDownLeft, x, y, null);
    	}else if(i < 251) {
    		g2d.drawImage(blockTopRight, x, y, null);
    	}else if(i < 255) {
    		g2d.drawImage(blockRight, x, y, null);
    	}else if(i < 256) {
    		g2d.drawImage(blockDownRight, x, y, null);
    	}else if(i < 258) {
    		g2d.drawImage(blockTop, x, y, null);
    	}else if(i < 259) {
    		g2d.drawImage(blockTopLeft, x, y, null);
    	}else if(i < 264) {
    		g2d.drawImage(blockLeft, x, y, null);
    	}else if(i < 265) {
    		g2d.drawImage(blockTop, x, y, null);
    	}else if(i < 269) {
    		g2d.drawImage(blockInside, x, y, null);
    	}else if(i < 270) {
    		g2d.drawImage(blockDown, x, y, null);
    	}else if(i < 271) {
    		g2d.drawImage(blockTop, x, y, null);
    	}else if(i < 275) {
    		g2d.drawImage(blockInside, x, y, null);
    	}else if(i < 276) {
    		g2d.drawImage(blockDown, x, y, null);
    	}else if(i < 277) {
    		g2d.drawImage(blockTop, x, y, null);
    	}else if(i < 281) {
    		g2d.drawImage(blockInside, x, y, null);
    	}else if(i < 282) {
    		g2d.drawImage(blockDown, x, y, null);
    	}else if(i < 283) {
    		g2d.drawImage(blockTopRight, x, y, null);
    	}else if(i < 287) {
    		g2d.drawImage(blockInside, x, y, null);
    	}else if(i < 288) {
    		g2d.drawImage(blockDownRight, x, y, null);
    	}else if(i < 314) {
    		g2d.drawImage(blockTop, x, y, null);
    	}else if(i < 315) {
    		g2d.drawImage(blockTopLeft, x, y, null);
    	}else if(i < 318) {
    		g2d.drawImage(blockTop, x, y, null);
    	}else if(i < 319) {
    		g2d.drawImage(blockTopRight, x, y, null);
    	}else if(i < 320) {
    		g2d.drawImage(blockTopLeft, x, y, null);
    	}else if(i < 325) {
    		g2d.drawImage(blockInside, x, y, null);
    	}else if(i < 326) {
    		g2d.drawImage(blockTopRight, x, y, null);
    	}else if(i < 327) {
    		g2d.drawImage(blockTopLeft, x, y, null);
    	}else if(i < 334) {
    		g2d.drawImage(blockInside, x, y, null);
    	}else if(i < 336) {
    		g2d.drawImage(blockTopRight, x, y, null);
    	}else if(i < 338) {
    		g2d.drawImage(blockInside, x, y, null);
    	}else if(i < 339) {
    		g2d.drawImage(blockTopRight, x, y, null);
    	}else if(i < 343) {
    		g2d.drawImage(blockInside, x, y, null);
    	}else if(i < 344) {
    		g2d.drawImage(blockTopRight, x, y, null);
    	}else if(i < 350) {
    		g2d.drawImage(blockInside, x, y, null);
    	}else if(i < 351) {
    		g2d.drawImage(blockTopRight, x, y, null);
    	}else if(i < 359) {
    		g2d.drawImage(blockInside, x, y, null);
    	}else if(i < 360) {
    		g2d.drawImage(blockTopRight, x, y, null);
    	}else if(i < 361) {
    		g2d.drawImage(blockTop, x, y, null);
    	}else if(i < 362) {
    		g2d.drawImage(blockTopLeft, x, y, null);
    	}else if(i < 363) {
    		g2d.drawImage(blockInside, x, y, null);
    	}else if(i < 364) {
    		g2d.drawImage(blockTopRight, x, y, null);
    	}else if(i < 365) {
    		g2d.drawImage(blockTopLeft, x, y, null);
    	}else if(i < 368) {
    		g2d.drawImage(blockInside, x, y, null);
    	}else if(i < 369) {
    		g2d.drawImage(blockTopRight, x, y, null);
    	}else if(i < 370) {
    		g2d.drawImage(blockTop, x, y, null);
    	}else if(i < 375) {
    		g2d.drawImage(blockInside, x, y, null);
    	}else if(i < 376) {
    		g2d.drawImage(blockTopRight, x, y, null);
    	}else if(i < 377) {
    		g2d.drawImage(blockTopLeft, x, y, null);
    	}else if(i < 390) {
    		g2d.drawImage(blockTop, x, y, null);
    	}else if(i < 391) {
    		g2d.drawImage(blockTopRight, x, y, null);
    	}else if(i < 392) {
    		g2d.drawImage(blockTopLeft, x, y, null);
    	}else if(i < 407) {
    		g2d.drawImage(blockInside, x, y, null);
    	}else if(i < 408) {
    		g2d.drawImage(blockTopRight, x, y, null);
    	}else if(i < 409) {
    		g2d.drawImage(blockTopLeft, x, y, null);
    	}else if(i < 426) {
    		g2d.drawImage(blockInside, x, y, null);
    	}else if(i < 427) {
    		g2d.drawImage(blockTopRight, x, y, null);
    	}else if(i < 428) {
    		g2d.drawImage(blockTopLeft, x, y, null);
    	}else if(i < 447) {
    		g2d.drawImage(blockInside, x, y, null);
    	}else if(i < 448) {
    		g2d.drawImage(blockTopRight, x, y, null);
    	}else if(i < 470) {
    		g2d.drawImage(blockTop, x, y, null);
    	}
    	//g2d.drawImage(blockTop, x, y, null);
//      g2d.draw(getBlockBounds());
    }
    
    public Rectangle getBlockBounds(){
        return new Rectangle(x, y, 45, 45);
    }
    
    public int getX(){
    	return x;
    }
    
    public int getY(){
    	return y;
    }

}