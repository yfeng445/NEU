# [Google Collab](https://colab.research.google.com/drive/1Aa2PaC2Zp0AW0H1KwWM_2R3f83hDVpLT#scrollTo=_gQ2FYfR37g7)
# [Google Slides](https://docs.google.com/presentation/d/1PqXja79OH6gbf2p_oupozT0n-4EYOMeA/)
# Roles:

### Slide 1: Overview (@Zzckin)

Conduct the business background investigation of the firm by answering 
- what the firm does
- what are the major business lines the firm has
- which business line is the firm's profit engine. 
- what is the business outlook of the firm.  
Visualize the stock price history (open, close, high, low, volume) from Jan 1, 2020 to Aug 31, 2024. 

- **What does NVIDIA do?**  
NVIDIA is a leading technology company specializing in graphics processing units (GPUs) for gaming, professional visualization, and AI applications, while also providing solutions for data centers and autonomous vehicle technologies. Its products are central to industries like AI, cloud computing, and autonomous driving.
  
- **Major business lines & profit engine (in 2024):**  
  - Gaming: $8.52 billion (31.6%)
  - Data Centers: $15.01 billion (55.6%)
  - Professional Visualization: $1.47 billion (5.4%)
  - Automotive: $0.903 billion (3.3%)
  - OEM and Others: $1.06 billion (4.1%)

- **Business outlook:**  
AI Growth: Significant investments in AI capabilities for data centers and cloud computing.
Partnerships: Continued expansion with cloud providers like Amazon Web Services (AWS), Google Cloud, and Microsoft Azure.
Autonomous Vehicles: Steady growth in the automotive sector with the DRIVE platform for autonomous vehicle technology.

[Reference](https://s201.q4cdn.com/141608511/files/doc_financials/2024/ar/NVIDIA-2024-Annual-Report.pdf)

### Slide 2: Competitor Overview (@MenggeLuo, @liyueyueli)

- Find 3 to 5 competitors' stocks (QCOM, AMD, INTC, AAPL, AVGO) and visualize the stock price history from Jan 1, 2020 to Aug 31, 2024 using [yfinance](https://pypi.org/project/yfinance/).

- **Competitors:**  

  - ***Advanced Micro Devices, Inc. (AMD):*** A semiconductor company that designs and produces CPUs, GPUs, and other computing products for gaming, data centers, and professional visualization.

  - ***Intel Corporation (INTC):*** A global leader in semiconductor manufacturing, best known for its processors used in computers, data centers, and networking technologies.

  - ***Qualcomm Incorporated (QCOM):*** A leading provider of wireless telecommunications products and services, specializing in semiconductors and software for mobile phones and network infrastructure.

  - ***Apple Inc. (AAPL):*** A multinational technology company known for designing and manufacturing consumer electronics, software, and services, including the iPhone, iPad, Mac, and various digital services.

  - ***Broadcom Inc. (AVGO):*** A global technology company that designs, develops, and supplies semiconductor and infrastructure software products for networking, broadband, and wireless communications.
    
**Business lines comparison Table:**  

| Company   | Gaming | Data Center | Automotive | AI/Cloud | Business to Consumer |
|-----------|--------|-------------|------------|----------|----------------------|
| **NVDA**  | Yes    | Yes         | Yes        | Yes      | No                   |
| **QCOM**  | No     | No          | Yes        | Yes      | Yes                  |
| **AMD**   | Yes    | Yes         | Yes        | Yes      | No                   |
| **INTC**  | Yes    | Yes         | Yes        | Yes      | No                   |
| **AAPL**  | No     | No          | No         | Yes      | Yes                  |
| **AVGO**  | No     | Yes         | Yes        | Yes      | No                   |


### Slide 3: Stock Price History: NVDA vs Competitors (@MenggeLuo, @liyueyueli)

- Take the Adjusted Close of your stock, calculate its mean, variance, skewness and kurtosis, and plot the nonparametric kernel density of the Adjusted Close.

- **Stock price (Jan 1, 2020 – Aug 31, 2024):**  
  Display an **overlay chart** of NVDA vs competitors (QCOM, AMD, INTC, AAPL, AVGO) showing stock trends.

- **Key events:**  
  Highlight major market-moving events (e.g., earnings, product launches).


### Slide 4: Mixture Modeling (@xiaobinwang0)

- the mixture modeling technique to approximate the empirical distribution using normal distributions as the component distribution

- **Key metrics:**  
  Present **mean, variance, skewness, kurtosis** for NVDA's Adjusted Close.
  
- **Density plot:**  
  Show the **kernel density plot** of NVDA's Adjusted Close.

### Slide 5: Bootstrap Analysis (@yfeng445)

- bootstrap analysis to find the 95% confidence interval of the mean estimates 

- **Comparison:**  
  Present the same metrics (mean, variance, skewness, kurtosis) for competitors in a **table**:

  | Company | Mean  | Variance | Skewness | Kurtosis |
  |---------|-------|----------|----------|----------|
  | NVDA    |       |          |          |          |
  | INTC    |       |          |          |          |
  | AMD     |       |          |          |          |
  | QCOM    |       |          |          |          |
  | AAPL    |       |          |          |          |
  | AVGO    |       |          |          |          |

- **Density comparison:**  
  Show **kernel density estimates** for each competitor alongside NVDA.

### Slide 6: Monte Carlo Simulation (@monica00zhang)

- Monte-Carlo analysis to simulate 1000 paths using five key parameters so as to mimic the empirical distribution of your stock.

- **Comparison:**  
  Present the best parameters (mu_1, sigma1, mu_2, sigma2, p) for competitors in a **table**:

  | Company |  mu_1 |  sigma1  |   mu_2   |  sigma2  |     p    |
  |---------|-------|----------|----------|----------|----------|
  | NVDA    |       |          |          |          |          |
  | INTC    |       |          |          |          |          |
  | AMD     |       |          |          |          |          |
  | QCOM    |       |          |          |          |          |
  | AAPL    |       |          |          |          |          |
  | AVGO    |       |          |          |          |          |


### Slide 7: Conclusion and Takeaways (@whoever)###

- **Business & stock performance comparison:**  
  Summarize **NVIDIA's business strength** vs competitors and **stock performance**.

- **Key insights from statistics:**  
  Conclude with a summary of **statistical analysis** and insights on stock behavior.

