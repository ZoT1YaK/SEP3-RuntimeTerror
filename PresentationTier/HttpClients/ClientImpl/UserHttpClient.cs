using System.Net.Http.Json;
using System.Security.Claims;
using System.Text.Json;
using HttpClients.ClientInterfaces;
using Shared.DTOs;
using Shared.Models;


namespace HttpClients.ClientImpl;

public class UserHttpClient : IUserService
{
    private readonly HttpClient Client;

    public UserHttpClient(HttpClient client)
    {
        Client = client;
    }
    
    public async Task<User> CreateAsync(UserCreationDTO dto)
    {
        HttpResponseMessage response = await Client.PostAsJsonAsync("/user/register", dto);
        
        if (!response.IsSuccessStatusCode)
        {
            string result = await response.Content.ReadAsStringAsync();
            throw new Exception(result);
        }
        
        
        var user = await response.Content.ReadFromJsonAsync<User>();
        if (user == null)
        {
            throw new Exception("Read User - Error");
        }
        return user;

        // User user = JsonSerializer.Deserialize<User>(result, new JsonSerializerOptions
        // {
        //     PropertyNameCaseInsensitive = true
        // })!;
        // return user;
    }

    public async Task<User> LoginAsync(UserLoginDTO dto)
    {
        HttpResponseMessage response = await Client.PostAsJsonAsync("/user/login", dto);
        if (!response.IsSuccessStatusCode)
        {
            string result = await response.Content.ReadAsStringAsync();
            throw new Exception(result);
        }
        
        var user = await response.Content.ReadFromJsonAsync<User>();
        if (user == null)
        {
            throw new Exception("Read User - Error");
        }
        return user;
    }

    // public Task LoginAsync(string username, string password)
    // {
    //     throw new NotImplementedException();
    // }
    //
    // public Task LogoutAsync()
    // {
    //     throw new NotImplementedException();
    // }
    //
    // public Task<ClaimsPrincipal> GetAuthAsync()
    // {
    //     throw new NotImplementedException();
    // }
    //
    // public Action<ClaimsPrincipal> OnAuthStateChanged { get; set; }
}