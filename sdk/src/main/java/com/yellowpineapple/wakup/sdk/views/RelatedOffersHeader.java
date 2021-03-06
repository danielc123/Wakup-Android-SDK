package com.yellowpineapple.wakup.sdk.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

import com.yellowpineapple.wakup.sdk.R;

/**
 * Created by agutierrez on 20/02/15.
 */
public class RelatedOffersHeader extends FrameLayout {

    public RelatedOffersHeader(Context context) {
        super(context);
        init();
    }

    public RelatedOffersHeader(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public RelatedOffersHeader(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.wk_view_related_offers_header, this);
    }

}
