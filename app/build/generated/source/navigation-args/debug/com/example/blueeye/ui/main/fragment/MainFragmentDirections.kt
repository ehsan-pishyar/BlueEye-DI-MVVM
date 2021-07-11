package com.example.blueeye.ui.main.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.blueeye.R

public class MainFragmentDirections private constructor() {
  public companion object {
    public fun actionMainFragmentToSearchFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainFragment_to_searchFragment)

    public fun actionMainFragmentToBottomSheetFragmentMain(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainFragment_to_bottomSheetFragmentMain)
  }
}
