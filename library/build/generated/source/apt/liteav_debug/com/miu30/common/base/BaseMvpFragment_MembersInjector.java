package com.miu30.common.base;

import com.jess.arms.mvp.IPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseMvpFragment_MembersInjector<P extends IPresenter>
    implements MembersInjector<BaseMvpFragment<P>> {
  private final Provider<P> mPresenterProvider;

  public BaseMvpFragment_MembersInjector(Provider<P> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static <P extends IPresenter> MembersInjector<BaseMvpFragment<P>> create(
      Provider<P> mPresenterProvider) {
    return new BaseMvpFragment_MembersInjector<P>(mPresenterProvider);
  }

  @Override
  public void injectMembers(BaseMvpFragment<P> instance) {
    injectMPresenter(instance, mPresenterProvider.get());
  }

  public static <P extends IPresenter> void injectMPresenter(
      BaseMvpFragment<P> instance, P mPresenter) {
    instance.mPresenter = mPresenter;
  }
}
