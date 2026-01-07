# mi-gestor-tareas

# Gestor de tareas (SPA + API)

App simple de gestión de tareas con login (JWT), CRUD de tareas y perfil.

## Estructura
- /backend -> Spring Boot (API)
- /frontend -> React (SPA)

## Variables de entorno

### Backend
- DATABASE_URL=jdbc:postgresql://localhost:5432/tasks_db
- JWT_SECRET=tu_secreto_largo
- CORS_ORIGIN=http://localhost:5173

### Frontend
- VITE_API_URL=http://localhost:8080

## Endpoints mínimos
- POST /api/auth/login
- GET /api/tasks
- GET /api/tasks/{id}
- POST /api/tasks
- PUT /api/tasks/{id}
- DELETE /api/tasks/{id}
