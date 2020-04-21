package com.miu30.common.base;

import com.jess.arms.mvp.IPresenter;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseMvpActivity_MembersInjector<P extends IPresenter>
    implements MembersInjector<BaseMvpActivity<P>> {
  private final Provider<P> mPresenterProvider;

  public BaseMvpActivity_MembersInjector(Provider<P> mPresenterProvider) {
    this.mPresenterProvider = mPresenterProvider;
  }

  public static <P extends IPresenter> MembersInjector<BaseMvpActivity<P>> create(
      Provider<P> mPresenterProvider) {
    return new BaseMvpActivity_MembersInjector<P>(mPresenterProvider);
  }

  @Override
  public void injectMembers(BaseMvpActivity<P> instance) {
    injectMPresenter(instance, mPresenterProvider.get());
  }

  public static <P extends IPresenter> void injectMPresenter(
      BaseMvpActivity<P> instance, P mPresenter) {
    instance.mPresenter = mPresenter;
  }
}
