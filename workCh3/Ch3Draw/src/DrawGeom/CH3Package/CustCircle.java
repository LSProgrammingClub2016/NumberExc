public package DrawGeom.CH3Package;

import java.awt.Graphics;
import java.awt.Point;

public class CustCircle 
{
	// member data
	private Graphics 	_graphicsContext;
	private int			_xOrig;
	private int			_yOrig;
	
	// construct
	public CustCircle  (Graphics gc, int xOrigin, int yOrigin)
	{
		_graphicsContext = gc;
		this._xOrig = xOrigin;
		this._yOrig = yOrigin;
	}
	
	//methods
	public void draw (int radius)
			  
	{
		if (errorCheckOk(radius))
		{
			_graphicsContext.drawOval (_xOrig, _yOrig, 2*radius, 2*radius);
		}
	
	}
	private boolean errorCheckOk(int radius)
	
	{
		//_graphicsContext.
		return true;
	}
}