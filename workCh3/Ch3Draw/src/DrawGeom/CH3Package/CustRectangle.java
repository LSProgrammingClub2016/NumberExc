public package DrawGeom.CH3Package;
import java.awt.Graphics;


public class CustRectangle 
{
	// member data
	// member data
	private Graphics 	_graphicsContext;
	private int			_xOrig;
	private int			_yOrig;
	
	public CustRectangle (Graphics gc, int xOrig, int yOrig)
	{
		_graphicsContext = gc;
		_xOrig = xOrig;
		_yOrig = yOrig;
	}
	
	public void draw (int height, int width)
	{
		if (errorCheckOk (height, width) )
		{
			this._graphicsContext.drawRect(_xOrig,  _yOrig, width, height);
		}
	}
	
	private boolean errorCheckOk (int height, int width)
	
	{
		//_graphicsContext.
		return true;
	}
}
