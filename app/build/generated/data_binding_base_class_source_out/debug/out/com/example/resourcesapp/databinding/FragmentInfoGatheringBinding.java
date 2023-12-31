// Generated by view binder compiler. Do not edit!
package com.example.resourcesapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.resourcesapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentInfoGatheringBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView recyclerViewInfoGathering;

  private FragmentInfoGatheringBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView recyclerViewInfoGathering) {
    this.rootView = rootView;
    this.recyclerViewInfoGathering = recyclerViewInfoGathering;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentInfoGatheringBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentInfoGatheringBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_info_gathering, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentInfoGatheringBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.recyclerView_InfoGathering;
      RecyclerView recyclerViewInfoGathering = ViewBindings.findChildViewById(rootView, id);
      if (recyclerViewInfoGathering == null) {
        break missingId;
      }

      return new FragmentInfoGatheringBinding((ConstraintLayout) rootView,
          recyclerViewInfoGathering);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
