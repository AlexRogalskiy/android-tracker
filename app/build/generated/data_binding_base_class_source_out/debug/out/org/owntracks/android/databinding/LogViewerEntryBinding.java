// Generated by view binder compiler. Do not edit!
package org.owntracks.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.textview.MaterialTextView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.owntracks.android.R;

public final class LogViewerEntryBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialTextView logDate;

  @NonNull
  public final MaterialTextView logMsg;

  private LogViewerEntryBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialTextView logDate, @NonNull MaterialTextView logMsg) {
    this.rootView = rootView;
    this.logDate = logDate;
    this.logMsg = logMsg;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LogViewerEntryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LogViewerEntryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.log_viewer_entry, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LogViewerEntryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.log_date;
      MaterialTextView logDate = rootView.findViewById(id);
      if (logDate == null) {
        break missingId;
      }

      id = R.id.log_msg;
      MaterialTextView logMsg = rootView.findViewById(id);
      if (logMsg == null) {
        break missingId;
      }

      return new LogViewerEntryBinding((ConstraintLayout) rootView, logDate, logMsg);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
