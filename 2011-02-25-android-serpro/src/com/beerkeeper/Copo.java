package com.beerkeeper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView.Validator;

public class Copo extends View {

	private Rect cerva;
	private Rect copo;

	private int left;
	private int right;
	private int top;
	private int bottom;

	private int topCopo;
	private int bottomCopo;
	private int conteudo;
	private String texto;

	public Copo(Context context, AttributeSet attrs) {
		super(context, attrs);
		top = 399;
		left = 0;
		right = 280;
		bottom = 400;
		topCopo = 30;
		bottomCopo = bottom;
		conteudo = bottomCopo - topCopo;
		texto = "Tô comendo água papá";
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub

		copo = new Rect(left, topCopo, right, bottomCopo);
		cerva = new Rect(left, top, right, bottom);

		Paint paint = new Paint();
		paint.setColor(Color.YELLOW);
		paint.setStyle(Style.FILL);

		Paint paintCopo = new Paint();
		paintCopo.setColor(Color.WHITE);
		paintCopo.setStyle(Style.STROKE);
		canvas.drawRect(copo, paintCopo);
		canvas.drawRect(cerva, paint);

		Paint paintTexto = new Paint();
		paintTexto.setColor(Color.WHITE);

		canvas.drawText(texto, 5, bottomCopo + 15, paintTexto);

		super.onDraw(canvas);
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		
		int touchTop = (int) event.getY();
		
		if (touchTop < topCopo) {
			top = topCopo;
		} else if (touchTop > bottomCopo) {
			top = bottomCopo;
		} else {
			top = touchTop;
		}
		
		int qtd = top/conteudo * 35;
		BeerKeeperBC beerKeeper = new BeerKeeperBC();
		texto = beerKeeper.getMensagemPorLatas(qtd);

		cerva.set(left, top, right, bottom);
		invalidate();
		super.onTouchEvent(event);
		return true;
		
	}

}
