# Configuration Package

This package contains Spring Boot configuration classes that set up various application components and external service integrations.

## Files

### AppConfig.java
A Spring configuration class that provides bean definitions for the application.

**Purpose:**
- Configures and provides a `WebClient` bean for making HTTP requests
- Uses Spring's reactive WebClient for non-blocking HTTP communication

**Key Components:**
- `webClient()`: Returns a default WebClient.Builder().build() instance that can be injected into services for making REST API calls

### GeminiConfig.java
Configuration class for integrating with Google's Gemini AI API.

**Purpose:**
- Holds configuration properties for Gemini API integration
- Provides access to API URL and authentication key

**Configuration Properties Required:**
- `gemini.api.url`: The base URL for the Gemini API endpoints
- `gemini.api.key`: The API key for authenticating with Gemini services

**Usage:**
This configuration is used by the `GeminiService` to interact with Google's Gemini AI models for AI-powered features in the application.

## Setup
Ensure the following properties are configured in `application.properties`:

```properties
gemini.api.url=https://generativelanguage.googleapis.com
gemini.api.key=your-api-key-here
```

Replace `your-api-key-here` with your actual Gemini API key obtained from Google AI Studio.