package com.example.android.softkeyboard;

import android.content.Context;
import android.inputmethodservice.KeyboardView;
import android.util.AttributeSet;

public class FreeFormView extends KeyboardView {
	
	static final int KEYCODE_OPTIONS = 666;
	public FreeFormView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FreeFormView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
	
}
