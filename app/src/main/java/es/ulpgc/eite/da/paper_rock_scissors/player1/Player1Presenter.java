package es.ulpgc.eite.da.paper_rock_scissors.player1;

import android.util.Log;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.da.paper_rock_scissors.game.AppMediator;


/**
 * Created by Luis on marzo, 2023
 */

public class Player1Presenter implements Player1Contract.Presenter {

  public static String TAG = "Paper-Rock-Scissors.Player1Presenter";

  private WeakReference<Player1Contract.View> view;
  private Player1State state;
  private Player1Contract.Model model;
  private AppMediator mediator;

  public Player1Presenter(AppMediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public void onStart() {
    Log.e(TAG, "onStart()");

    // call the mediator initialize the state
    state = new Player1State();

    // TODO: add code if is necessary

  }

  @Override
  public void onRestart() {
    Log.e(TAG, "onRestart()");

    // TODO: add code if is necessary

  }

  @Override
  public void onResume() {
    Log.e(TAG, "onResume()");

    // TODO: add code if is necessary

    // update the view
    view.get().onViewModelDataUpdated(state);

  }

  @Override
  public void onBackPressed() {
    Log.e(TAG, "onBackPressed()");

    // TODO: add code if is necessary

  }

  @Override
  public void onPause() {
    Log.e(TAG, "onPause()");

    // TODO: add code if is necessary

  }

  @Override
  public void onDestroy() {
    Log.e(TAG, "onDestroy()");

    // TODO: add code if is necessary

  }

  @Override
  public void onButtonClicked(String option) {
    Log.e(TAG, "onButtonClicked()");

    // TODO: add code if is necessary

  }


  @Override
  public void injectView(WeakReference<Player1Contract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(Player1Contract.Model model) {
    this.model = model;
  }

}