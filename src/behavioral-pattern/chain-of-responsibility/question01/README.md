The Chain of Responsibility pattern is often used in event-driven systems, where a request may trigger a series of events that need to be processed in a specific order. It can also be used to implement error handling or exception handling in a system.
Suppose you are designing a payment processing system that accepts payments from various
sources such as credit cards, bank transfers, paypal and e-wallets. You want to implement a system
where each payment method is handled by a separate handler, and if one handler cannot process the payment,
it passes the request to the next handler until it is successfully processed. How
would you implement this in java?