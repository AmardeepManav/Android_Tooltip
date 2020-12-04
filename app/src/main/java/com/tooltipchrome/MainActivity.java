package com.tooltipchrome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.PopupWindow;

import com.kcrimi.tooltipdialog.ToolTipDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public void clicked(View view) {
        ChromeHelpPopup chromeHelpPopup = new ChromeHelpPopup(MainActivity.this,"Hellosafll jopfj  psje  fse p as !");
        chromeHelpPopup.show(view);

        int[] location = new int[2];

        view.getLocationOnScreen(location);
        view.measure(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);

        int rootHeight = view.getMeasuredHeight();
        int rootWidth = view.getMeasuredWidth();
        WindowManager mWindowManager = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
        final int screenWidth = mWindowManager.getDefaultDisplay().getWidth();
        final int screenHeight = mWindowManager.getDefaultDisplay().getHeight();
        Rect anchorRect = new Rect(location[0], location[1], location[0]
                + view.getWidth(), location[1] + view.getHeight());
        int yPos = anchorRect.top - rootHeight;

        boolean onTop = true;



//        new ToolTipDialog(MainActivity.this, MainActivity.this, R.style.TooltipDialogTheme)
//                .title("This is a basic dialog") // Define the title for the tooltip
////               .addPeekThroughView(view)
//                .pointTo(rootHeight, rootWidth)
//                .show();
//        BubbleLayout bubbleLayout = (BubbleLayout) LayoutInflater.from(this).inflate(R.layout.layout_sample_popup, null);
//        PopupWindow popupWindow = new BubblePopupHelper.create(this, bubbleLayout);
//
//        int[] location = new int[2];
//        v.getLocationInWindow(location);
//        if (random.nextBoolean()) {
//            bubbleLayout.setArrowDirection(ArrowDirection.TOP);
//        } else {
//            bubbleLayout.setArrowDirection(ArrowDirection.BOTTOM);
//        }
//        popupWindow.showAtLocation(v, Gravity.NO_GRAVITY, location[0], v.getHeight() + location[1]);
    }


}