"""Highly Profitable Months
The stocks of a company are being surveyed to analyze the net profit of the company over a period of several months.
For an analysis parameter k, a group of k consecutive months is said to be highly profitable if the values of the
stock prices are strictly increasing for those months. Given the stock prices of the company for n months
and the analysis parameter k, find the number of highly profitable months.

Example
stockPrices = [5, 3, 5, 7, 8]
k= 3

These are the groups of k months in which the stock prices are strictly increasing:
Hence the answer is 2.

Function Description
Complete the function countHighlyProfitableMonths in the editor below.

countHighlyProfitableMonths has the following parameters:
    int stockPrices[n) the stock prices for n months
    int k: the analysis parameter

Returns
    int the number of highly profitable months

Constraints
• 1 <= k <= 2*10^5
• 1 <= stockPrices[i] <= 10^9
"""
from typing import List


def count_highly_profitable_months(stock_prices: List[int], k: int) -> int:
    """Count highly profitable months using dynamic programming."""
    count = 0
    pre = 0
    for i in range(1, len(stock_prices)):
        if stock_prices[i] <= stock_prices[i - 1]:
            pre = i
        if i - pre + 1 >= k:
            count += 1
    return count


if __name__ == '__main__':
    print(count_highly_profitable_months([5, 3, 5, 7, 8, 9], 3))
