package com.example.amhso.digipayk;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;


public class TouchEventView extends View {
    private Paint paint = new Paint();
    private Path path = new Path();
    Context context;

    private int x=100,y=100;
    GestureDetector gestureDetector;



    public TouchEventView(Context context, AttributeSet attrs) {
        super(context, attrs);
        gestureDetector = new GestureDetector(context, new GestureListener());
        this.context = context;

        paint.setAntiAlias(true);
        paint.setStrokeWidth(3f);
        paint.setColor(Color.BLACK);

        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);


    }




    public void setColor(int r, int g, int b) {
        int rgb = Color.rgb(r, g, b);
        paint.setColor(rgb);
    }




    private class GestureListener extends GestureDetector.SimpleOnGestureListener {
        // event when double tap occurs
        @Override
        public boolean onDoubleTap(MotionEvent e) {
            float x = e.getX();
            float y = e.getY();

            // clean drawing area on double tap
            path.reset();
            Log.d("Double Tap", "Tapped at: (" + x + "," + y + ")");

            return true;
        }

    }



    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawPath(path, paint);


//        path.moveTo(100, 100);
//        path.lineTo(0, 200);
//        path.lineTo(0, 0);
//        path.lineTo(200, 0);
//        path.lineTo(200, 200);
//        path.lineTo(0, 200);





//        path.addCircle(50,
//               50, 50,
//                Path.Direction.CW);



//        path.quadTo(0, 200, 200,200);

        invalidate();
    }





    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float eventX = event.getX();
        float eventY = event.getY();

        Log.i("wwwwwwwwwwwwwwwwwwww", "wwwwwwwwwwwwwwwwwwwww"+event.getY()+"--"+event.getX());

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.i("11111111111111", "action_down");
                path.moveTo(eventX, eventY);
                return true;
            case MotionEvent.ACTION_MOVE:
                Log.i("222222222222222", "action_move");

                path.lineTo(eventX, eventY);

                break;
            case MotionEvent.ACTION_UP:
                Log.i("33333333333333333", "action_up");

//                path.reset();
                break;
            default:
                return false;
        }

//        // for demostraction purposes
//        gestureDetector.onTouchEvent(event);
//        // Schedules a repaint.
//        invalidate();
        return true;
    }
}