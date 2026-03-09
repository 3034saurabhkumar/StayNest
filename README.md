# 🏨 StayNest

A full-featured **Hotel Booking Backend** built with Spring Boot, featuring secure authentication, Stripe payment integration, dynamic pricing, and a comprehensive REST API.

---

## 🚀 Features

- 🔐 **Authentication & Authorization** — JWT-based security using Spring Security
- 💳 **Stripe Payment Gateway** — Secure payment processing with webhook support
- 📅 **Hotel Search & Booking API** — Search availability and manage reservations
- 💰 **Dynamic Pricing** — Scheduled price updates based on demand/availability
- 🛠️ **Admin API** — Manage hotels, rooms, and bookings
- 📦 **RESTful Architecture** — Clean layered architecture (Controller → Service → Repository)

---

## 🛠️ Tech Stack

| Layer | Technology |
|---|---|
| Language | Java 17+ |
| Framework | Spring Boot |
| Security | Spring Security + JWT |
| Database | MySQL / PostgreSQL |
| ORM | Spring Data JPA / Hibernate |
| Payments | Stripe API |
| Build Tool | Maven |
| Scheduler | Spring Scheduler |

---

## 📁 Project Structure

```
src/main/java/com/saurabh/staynest/
├── controller/         # REST Controllers (Booking, Webhook, Admin)
├── service/            # Business Logic
├── repository/         # JPA Repositories
├── dto/                # Data Transfer Objects
├── entity/             # JPA Entities
├── config/             # Security & App Configuration
├── exception/          # Global Exception Handling
└── advice/             # Controller Advice
```

---

## ⚙️ Setup & Installation

### Prerequisites
- Java 17+
- Maven 3.8+
- MySQL or PostgreSQL
- Stripe Account (for payment features)

### 1. Clone the Repository
```bash
git clone https://github.com/3034saurabhkumar/StayNest.git
cd StayNest
```

### 2. Configure Environment Variables
Create a `.env` file or set environment variables (do **not** hardcode secrets):

```env
DB_URL=jdbc:mysql://localhost:3306/staynest
DB_USERNAME=your_db_user
DB_PASSWORD=your_db_password

JWT_SECRET=your_jwt_secret

STRIPE_SECRET_KEY=sk_test_...
STRIPE_WEBHOOK_SECRET=whsec_...
```

### 3. Configure `application.properties`
```properties
spring.datasource.url=${DB_URL}
spring.datasource.username=${DB_USERNAME}
spring.datasource.password=${DB_PASSWORD}

stripe.api.key=${STRIPE_SECRET_KEY}
stripe.webhook.secret=${STRIPE_WEBHOOK_SECRET}
```

### 4. Build & Run
```bash
./mvnw clean install
./mvnw spring-boot:run
```

The server starts at `http://localhost:8080`

---

## 📡 API Endpoints

### Auth
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/auth/register` | Register a new user |
| POST | `/api/auth/login` | Login and receive JWT |

### Hotels & Search
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/hotels/search` | Search available hotels |
| GET | `/api/hotels/{id}` | Get hotel details |

### Booking
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/bookings` | Create a booking |
| GET | `/api/bookings/{id}` | Get booking details |
| DELETE | `/api/bookings/{id}` | Cancel a booking |

### Admin
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/admin/hotels` | Add a new hotel |
| PUT | `/api/admin/hotels/{id}` | Update hotel info |
| GET | `/api/admin/bookings` | View all bookings |

### Payments
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/payments/checkout` | Initiate Stripe payment |
| POST | `/api/webhook` | Stripe webhook handler |

---

## 💳 Stripe Integration

StayNest uses **Stripe** for payment processing.

1. Create a Stripe account at [stripe.com](https://stripe.com)
2. Get your **Secret Key** and **Webhook Secret** from the Stripe Dashboard
3. Set them as environment variables (never commit them to git)
4. For local testing, use the [Stripe CLI](https://stripe.com/docs/stripe-cli) to forward webhooks:

```bash
stripe listen --forward-to localhost:8080/api/webhook
```

---

## 🔒 Security Notes

- All secrets are managed via **environment variables** — never hardcoded
- `.env` is listed in `.gitignore`
- JWT tokens are used for stateless authentication
- Role-based access control separates user and admin endpoints

---

## 🧪 Running Tests

```bash
./mvnw test
```

---

## 📌 Roadmap

- [ ] Email notifications for booking confirmation
- [ ] Room image uploads (S3)
- [ ] Review & Rating system
- [ ] Frontend (React / Next.js)
- [ ] Docker + CI/CD pipeline

---

## 👨‍💻 Author

**Saurabh Kumar**
- GitHub: [@3034saurabhkumar](https://github.com/3034saurabhkumar)

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
