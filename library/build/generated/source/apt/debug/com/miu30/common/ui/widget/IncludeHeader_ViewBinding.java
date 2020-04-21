// Generated code from Butter Knife. Do not modify!
package com.miu30.common.ui.widget;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.miu360.library.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class IncludeHeader_ViewBinding implements Unbinder {
  private IncludeHeader target;

  @UiThread
  public IncludeHeader_ViewBinding(IncludeHeader target, View source) {
    this.target = target;

    target.ibtnLeft = Utils.findRequiredViewAsType(source, R.id.ibtn_left, "field 'ibtnLeft'", ImageButton.class);
    target.tvTitle = Utils.findRequiredViewAsType(source, R.id.tv_title, "field 'tvTitle'", TextView.class);
    target.tvLeft = Utils.findRequiredViewAsType(source, R.id.tv_left, "field 'tvLeft'", TextView.class);
    target.tvRight = Utils.findRequiredViewAsType(source, R.id.tv_right, "field 'tvRight'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    IncludeHeader target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.ibtnLeft = null;
    target.tvTitle = null;
    target.tvLeft = null;
    target.tvRight = null;
  }
}
