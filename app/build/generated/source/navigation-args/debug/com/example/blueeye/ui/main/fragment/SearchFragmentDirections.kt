package com.example.blueeye.ui.main.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.blueeye.R

public class SearchFragmentDirections private constructor() {
  public companion object {
    public fun actionSearchFragmentToAboutMeFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_searchFragment_to_aboutMeFragment)

    public fun actionSearchFragmentToMainFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_searchFragment_to_mainFragment)
  }
}
