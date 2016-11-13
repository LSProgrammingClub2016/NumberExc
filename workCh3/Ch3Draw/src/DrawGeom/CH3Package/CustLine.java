public package DrawGeom.CH3Package;

import java.awt.Graphics;

public class CustLine 
{
	
	// member data
		// member data
		private Graphics 	_graphicsContext;
		private int			_xBegin;
		private int			_yBegin;
		
		public CustLine (Graphics gc, int xBegin, int yBegin)
		{
			_graphicsContext = gc;
			_xBegin = xBegin;
			_yBegin = yBegin;
			
		}
		
		public void draw (int xEnd, int yEnd)
		{
			if (errorCheckOk (xEnd, yEnd) )
			{
				this._graphicsContext.drawLine(_xBegin,  _yBegin, xEnd, yEnd);
			}
		}
		
		private boolean errorCheckOk (int xEnd, int yEnd)
		
		{
			//_graphicsContext.
			return true;
		}

}
