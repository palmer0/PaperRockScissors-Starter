package es.ulpgc.eite.da.paper_rock_scissors.player2;

import android.util.Log;

import java.lang.ref.WeakReference;

import es.ulpgc.eite.da.paper_rock_scissors.game.AppMediator;


/**
 * Created by Luis on marzo, 2023
 */

public class Player2Presenter implements Player2Contract.Presenter {

  public static String TAG = "Paper-Rock-Scissors.Player2Presenter";

  private WeakReference<Player2Contract.View> view;
  private Player2State state;
  private Player2Contract.Model model;
  private AppMediator mediator;

  public Player2Presenter(AppMediator mediator) {
    this.mediator = mediator;
  }

  @Override
  public void onStart() {
    Log.e(TAG, "onStart()");

    // call the mediator initialize the state
    state = new Player2State();

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
  public void injectView(WeakReference<Player2Contract.View> view) {
    this.view = view;
  }

  @Override
  public void injectModel(Player2Contract.Model model) {
    this.model = model;
  }

}