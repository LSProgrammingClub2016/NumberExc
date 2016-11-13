public package DrawGeom.CH3Package;

import java.awt.*;

public class CustTriangle 
{
	// member data
	private Graphics 	_graphicsContext;
	private int			_xOrig;
	private int			_yOrig;
	
	
	// construct
	public CustTriangle (Graphics gc, int xOrigin, int yOrigin)
	{
		this._graphicsContext = gc;
		_xOrig = xOrigin;
		_yOrig = yOrigin;
	}
	
	public void draw (int xVertex2, int yVertex2,
					  int xVertex3, int yVertex3)
	{
		Point vertex2 = new Point (xVertex2, yVertex2);
		Point vertex3 = new Point (xVertex3, yVertex3);
		if (errorCheckOk(vertex2, vertex3))
		{
			//_graphicsContext.setColor(Color.white);	
			/*
			_graphicsContext.drawLine (_xOrig,_yOrig,
									   xVertex2, yVertex2);
			_graphicsContext.drawLine (_xOrig,_yOrig,
					   					xVertex3, yVertex3);
			_graphicsContext.drawLine (xVertex3, yVertex3,
					   					xVertex2, yVertex2);
		    */
			// this is used only to test the structure of the code
			CustLine sideOne = new CustLine (_graphicsContext, _xOrig, _yOrig);
			sideOne.draw (xVertex2, yVertex2);
			
			CustLine sideTwo = new CustLine (_graphicsContext, _xOrig, _yOrig);
			sideTwo.draw(xVertex3,  yVertex3);
			
			CustLine sideThree = new CustLine (_graphicsContext, xVertex3, yVertex3);
			sideThree.draw(xVertex2,  yVertex2);
		}
		
	}
	
	// return true if the gc is large enough and the origin
	// is in the right place. 
	private boolean errorCheckOk(Point vertex2, Point vertex3)
	
	{
		//_graphicsContext.
		return true;
	}
	
}
