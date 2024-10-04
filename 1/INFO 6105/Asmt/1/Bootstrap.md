##### Bootstrap 

In bootstrap analysis, we resample the original dataset with replacement. We pick a large number of resample times, in our case, we choose B=1000. For each resampling, we randomly select data points from the original dataset, allowing the same data point to be chosen multiple times. Each resample produces a dataset of the same size as the original. For each resampled dataset, we calculate statistics such as the mean, standard error, and standard deviation. Finally, we summarize these results across all resamples, using them produce the estimate confidence intervals shown.

What calls for attention is that in standard confidence interval, method 1 and method 2 shows same value. It is because method 1 takes the standard errors and rescales them by square root of (T) to estimate the standard deviation. Method 2 directly works with the bootstrapped standatd deviations. They give the same result because the two methods are mathematically related through the formula Standard Error = Standard Deviation divided by square root of (T).

Lets take a look at the other rows.

For Mean Confidence interval, the range shows the fluctuation of the stock price. For example, intel has a narrow confidence interval, which indicates that its stock is relatively stable and easier to predict.
For Sandard Error of the mean confidence interval, the smaller the range is, the higher the accuracy the estimation of the mean has.
For Standard Deviation Confidence interval, the narrower the range, the more consistent the stock's price variability is. A narrow range suggest that the variability in the stock price is predictable. 

Finally, let go back to NVDA's data.

Its mean confidence interval is (30.04, 33.53), this relatively narrow range indicates that NVDA's stock is stable and low variability. 
Standard Error of the mean confidence interval (0.81, 0.92), this low value indicates that there is little uncertainty in estimating the price of NVDIA's stock.
Standard Deviation Confidence interval (27.7, 31.48), which reflects a moderate volatility. It is not as stable as Intel, but more stable than companies like Apple or Broadcom. 

