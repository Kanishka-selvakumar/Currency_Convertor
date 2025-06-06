function convertCurrency() {
  const amount = parseFloat(document.getElementById('amount').value);
  const from = document.getElementById('fromCurrency').value;
  const to = document.getElementById('toCurrency').value;

  if (isNaN(amount) || amount <= 0) {
    alert('Please enter a valid amount');
    return;
  }

  // Fixed exchange rates (approximate)
  const rates = {
    USD: { INR: 82.75, EUR: 0.91, USD: 1 },
    INR: { USD: 1 / 82.75, EUR: 0.91 / 82.75, INR: 1 },
    EUR: { USD: 1 / 0.91, INR: 82.75 / 0.91, EUR: 1 },
  };

  const rate = rates[from][to];
  const convertedAmount = amount * rate;

  document.getElementById('result').innerText =
    `${amount.toFixed(2)} ${from} = ${convertedAmount.toFixed(2)} ${to}`;
}
