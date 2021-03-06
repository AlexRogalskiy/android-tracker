// Generated by data binding compiler. Do not edit!
package org.owntracks.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import java.lang.Deprecated;
import java.lang.Object;
import org.owntracks.android.R;

public abstract class UiWelcomeFinishBinding extends ViewDataBinding {
  @NonNull
  public final ImageView img;

  @NonNull
  public final TextView screenDesc;

  @NonNull
  public final TextView screenHeading;

  @NonNull
  public final RelativeLayout welcomeFragment;

  protected UiWelcomeFinishBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageView img, TextView screenDesc, TextView screenHeading, RelativeLayout welcomeFragment) {
    super(_bindingComponent, _root, _localFieldCount);
    this.img = img;
    this.screenDesc = screenDesc;
    this.screenHeading = screenHeading;
    this.welcomeFragment = welcomeFragment;
  }

  @NonNull
  public static UiWelcomeFinishBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.ui_welcome_finish, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static UiWelcomeFinishBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<UiWelcomeFinishBinding>inflateInternal(inflater, R.layout.ui_welcome_finish, root, attachToRoot, component);
  }

  @NonNull
  public static UiWelcomeFinishBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.ui_welcome_finish, null, false, component)
   */
  @NonNull
  @Deprecated
  public static UiWelcomeFinishBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<UiWelcomeFinishBinding>inflateInternal(inflater, R.layout.ui_welcome_finish, null, false, component);
  }

  public static UiWelcomeFinishBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static UiWelcomeFinishBinding bind(@NonNull View view, @Nullable Object component) {
    return (UiWelcomeFinishBinding)bind(component, view, R.layout.ui_welcome_finish);
  }
}
