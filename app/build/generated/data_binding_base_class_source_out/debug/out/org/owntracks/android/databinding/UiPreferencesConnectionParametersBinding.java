// Generated by data binding compiler. Do not edit!
package org.owntracks.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.rengwuxian.materialedittext.MaterialEditText;
import java.lang.Deprecated;
import java.lang.Object;
import org.owntracks.android.R;
import org.owntracks.android.ui.preferences.connection.dialog.ConnectionParametersViewModel;

public abstract class UiPreferencesConnectionParametersBinding extends ViewDataBinding {
  @NonNull
  public final SwitchCompat cleanSession;

  @NonNull
  public final MaterialEditText keepalive;

  @NonNull
  public final RelativeLayout tlsWrapper;

  @Bindable
  protected ConnectionParametersViewModel mVm;

  protected UiPreferencesConnectionParametersBinding(Object _bindingComponent, View _root,
      int _localFieldCount, SwitchCompat cleanSession, MaterialEditText keepalive,
      RelativeLayout tlsWrapper) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cleanSession = cleanSession;
    this.keepalive = keepalive;
    this.tlsWrapper = tlsWrapper;
  }

  public abstract void setVm(@Nullable ConnectionParametersViewModel vm);

  @Nullable
  public ConnectionParametersViewModel getVm() {
    return mVm;
  }

  @NonNull
  public static UiPreferencesConnectionParametersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.ui_preferences_connection_parameters, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static UiPreferencesConnectionParametersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<UiPreferencesConnectionParametersBinding>inflateInternal(inflater, R.layout.ui_preferences_connection_parameters, root, attachToRoot, component);
  }

  @NonNull
  public static UiPreferencesConnectionParametersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.ui_preferences_connection_parameters, null, false, component)
   */
  @NonNull
  @Deprecated
  public static UiPreferencesConnectionParametersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<UiPreferencesConnectionParametersBinding>inflateInternal(inflater, R.layout.ui_preferences_connection_parameters, null, false, component);
  }

  public static UiPreferencesConnectionParametersBinding bind(@NonNull View view) {
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
  public static UiPreferencesConnectionParametersBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (UiPreferencesConnectionParametersBinding)bind(component, view, R.layout.ui_preferences_connection_parameters);
  }
}
